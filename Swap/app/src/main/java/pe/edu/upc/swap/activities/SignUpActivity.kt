package pe.edu.upc.swap.activities

import android.app.Activity
import android.app.DatePickerDialog
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.drawable.BitmapDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Base64
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.widget.Toolbar
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_sign_up.*
import pe.edu.upc.swap.R
import pe.edu.upc.swap.data.network.RetrofitClient
import pe.edu.upc.swap.data.network.model.LoginResponse
import pe.edu.upc.swap.data.network.model.SignUpRequest
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.ByteArrayOutputStream
import java.io.IOException
import java.util.*
import kotlin.collections.ArrayList

class SignUpActivity : AppCompatActivity() {

    //region variables
    var PICK_IMAGE_REQUEST = 1
    var picture: String = ""
    var gender = ""
    var country = 0
    //to restart
    var learn = 0
    var mother = 0
    var level = 0

    private val c = Calendar.getInstance()
    private val y = c.get(Calendar.YEAR)
    private val m = c.get(Calendar.MONTH)
    private val d = c.get(Calendar.DAY_OF_MONTH)

    //to restart
    private var languages: MutableList<Int> = ArrayList()
    private var levels: MutableList<Int> = ArrayList()

    private var wishes: MutableList<Int> = ArrayList()

    var motherValid: Boolean = true
    var learnValid: Boolean = true
    var levelValid: Boolean = true
    var genderValid: Boolean = true
    var countryValid: Boolean = true

    lateinit var toolbar: Toolbar
    lateinit var progressBar: ProgressBar
    //endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        progressBar = findViewById(R.id.progressBar)
        progressBar.visibility = View.INVISIBLE

        //region variables
        levels.add(0,4)
        wishes.add(0, 1)
        wishes.add(1, 2)
        //endregion

        //region spinner & radioButton
        spinnerGender()
        spinnerCountry()
        spinnerLanguage()
        getWish()
        //endregion

        //validation
        sGender.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when(p2){
                    1 -> {
                        genderValid = true
                        gender = "Female"}
                    2 -> {
                        genderValid = true
                        gender = "Male"}
                    else -> {
                        gender = ""
                        genderValid = false}
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //validation
        sCountry.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when(p2){
                    1 -> {
                        countryValid = true
                        country = 1
                    }
                    2 -> {
                        countryValid = true
                        country = 2
                    }
                    3 -> {
                        countryValid = true
                        country = 3
                    }
                    4 -> {
                        countryValid = true
                        country = 4
                    }
                    else -> {
                        countryValid = false
                        country = 0
                    }
                }
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //validation
        sLearnLng.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

                when(p2){
                    1 -> {
                        learnValid = true
                        when(mother) {
                            1 -> learn = 2 //languages.add(1, 2)
                            2 -> learn = 1//languages.add(1, 1)
                            3 -> learn = 1//languages.add(1, 1)
                            4 -> learn = 1//languages.add(1, 1)
                            else -> learn = 0//languages.add(1, 0)
                        }
                    }
                    2 -> {
                        learnValid = true
                        when(mother){
                            1 -> learn = 3//languages.add(1, 3)
                            2 -> learn = 3//languages.add(1, 3)
                            3 -> learn = 2//languages.add(1, 2)
                            4 -> learn = 2//languages.add(1, 2)
                            else -> learn = 0//languages.add(1, 0)
                        }
                    }
                    3 -> {
                        learnValid = true
                        when(mother){
                            1 -> learn = 4//languages.add(1, 4)
                            2 -> learn = 4//languages.add(1, 4)
                            3 -> learn = 4//languages.add(1, 4)
                            4 -> learn = 3//languages.add(1, 3)
                            else -> learn = 0//languages.add(1, 0)
                        }
                    }
                    else -> {
                        learnValid = false
                    }
                }
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        //region Toolbar
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = resources.getString(R.string.hint_title_register)
        //endregion
    }

    override fun onStart() {
        super.onStart()
        spinnerLanguage()
    }

    //Insert Photo into Image View
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == PICK_IMAGE_REQUEST && resultCode == Activity.RESULT_OK && data != null && data.data != null){
            val uri: Uri = data.data!!
            try{
                val bitmap: Bitmap = MediaStore.Images.Media.getBitmap(contentResolver, uri)
                var temp: Int = (bitmap.height * (90.0 / bitmap.width)).toInt()
                var resizeBitmap = Bitmap.createScaledBitmap(bitmap, 90, temp, false)
                ivProfile.setImageBitmap(resizeBitmap)
            }catch(ex: IOException){
                ex.printStackTrace()
            }
        }
    }

    private fun spinnerGender(){

        val genders = arrayOf(resources.getString(R.string.hint_gender), resources.getString(R.string.hint_female), resources.getString(R.string.hint_male))

        val aGender = ArrayAdapter(applicationContext, R.layout.spinner_item, genders)
        sGender!!.adapter = aGender
    }

    private fun spinnerCountry(){

        val countries = arrayOf(resources.getString(R.string.hint_country), "Peru", "United States", "Japan", "Brazil")

        val aCountry = ArrayAdapter(applicationContext, R.layout.spinner_item, countries)
        sCountry!!.adapter = aCountry
    }

    private fun spinnerLanguage(){

        val m_languages = arrayOf(resources.getString(R.string.hint_mother_lng), "Spanish", "English", "Japanese", "Portuguese")
        var l_languages = arrayOf(resources.getString(R.string.hint_learn_lng))

        val aMLng = ArrayAdapter(applicationContext, R.layout.spinner_item, m_languages)
        sMotherLng!!.adapter = aMLng

        //validation
        sMotherLng.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                when (p2) {
                    1 -> {
                        motherValid = true
                        l_languages = arrayOf(resources.getString(R.string.hint_learn_lng), "English", "Japanese", "Portuguese")
                        mother = 1//languages.add(0, 1)
                    }
                    2 -> {
                        motherValid = true
                        l_languages = arrayOf(resources.getString(R.string.hint_learn_lng),"Spanish", "Japanese", "Portuguese")
                        mother = 2//languages.add(0, 2)
                    }
                    3 -> {
                        motherValid = true
                        l_languages = arrayOf(resources.getString(R.string.hint_learn_lng), "Spanish", "English", "Portuguese")
                        mother = 3//languages.add(0, 3)
                    }
                    4 -> {
                        motherValid = true
                        l_languages = arrayOf(resources.getString(R.string.hint_learn_lng), "Spanish", "English", "Japanese")
                        mother = 4//languages.add(0, 4)
                    }
                    else -> {
                        motherValid = false
                        l_languages = arrayOf(resources.getString(R.string.hint_learn_lng))
                    }
                }
                val aLLng = ArrayAdapter(applicationContext, R.layout.spinner_item, l_languages)
                sLearnLng!!.adapter = aLLng
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
    }

    //Convert Bitmap to Base64 String
    private fun getImage(bitmap: Bitmap): String{
        //var resizeBitmap = Bitmap.createScaledBitmap(bitmap, 80, 80, true)
        var byteArray = ByteArrayOutputStream()
        //resizeBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArray)
        bitmap.compress(Bitmap.CompressFormat.JPEG, 50, byteArray)
        var imageBytes = byteArray.toByteArray()
        return Base64.encodeToString(imageBytes, Base64.DEFAULT)
    }

    //Show Gallery
    fun showFileImage(view: View){
        val intent = Intent()
        intent.type = "image/*"
        intent.action = Intent.ACTION_GET_CONTENT
        startActivityForResult(Intent.createChooser(intent, resources.getString(R.string.hint_image)), PICK_IMAGE_REQUEST)
    }

    //Datetime Picker
    fun clickBirthday(view: View){
        val dp = DatePickerDialog(
            this@SignUpActivity,
            DatePickerDialog.OnDateSetListener { _, year, monthOfYear, dayOfMonth ->
                val date: String = String.format(
                    Locale.getDefault(),
                    "%02d-%02d-%02d",
                    year,
                    monthOfYear + 1,
                    dayOfMonth
                )
                tBirthday.setText(date)
            }, y, m, d
        )
        dp.show()
    }

    //validation - RadioButton level of language to learn
    private fun getWish(){

        rgLevel.setOnCheckedChangeListener { _, checkedId ->
                val radio: RadioButton = findViewById(checkedId)
                when(radio.text){
                    resources.getString(R.string.hint_beginner) -> {
                        levelValid = true
                        level = 0
                    }
                    resources.getString(R.string.hint_basic) -> {
                        levelValid = true
                        level = 1
                    }
                    resources.getString(R.string.hint_intermediate) -> {
                        levelValid = true
                        level = 2
                    }
                    resources.getString(R.string.hint_advance) -> {
                        levelValid = true
                        level = 3
                    }
                    else -> {levelValid = false}
                }
            }
    }

    fun onSignUp(view: View){

        progressBar.visibility = View.VISIBLE

        //region variables
        var isValid: Boolean = true
        val name = tName.text.toString().trim()
        val lastName = tLastname.text.toString().trim()
        val email = tEmail.text.toString().trim()
        val password = tPassword.text.toString().trim()
        val birthday = tBirthday.text.toString().trim()
        val mobile = tMobile.text.toString().trim()
        val description = tDescription.text.toString().trim()
        //endregion

        //region validation empty
        if(!motherValid || !learnValid || !levelValid || !genderValid || !countryValid){
            isValid = false
        }

        if (name.isEmpty()){
            tlName.error = resources.getString(R.string.alert_name)
            isValid = false
        } else {
            tlName.isErrorEnabled = false
        }

        if (lastName.isEmpty()){
            tlLastname.error = resources.getString(R.string.alert_last_name)
            isValid = false
        } else {
            tlLastname.isErrorEnabled = false
        }

        if (email.isEmpty()){
            tlEmail.error = resources.getString(R.string.alert_email)
            isValid = false
        } else {
            tlEmail.isErrorEnabled = false
        }

        if (password.isEmpty() || password.length <= 3){
            tlPassword.error = resources.getString(R.string.alert_password)
            isValid = false
        } else {
            tlPassword.isErrorEnabled = false
        }

        if (birthday.isEmpty()){
            tlBirthday.error = resources.getString(R.string.alert_birthday)
            isValid = false
        } else {
            tlBirthday.isErrorEnabled = false
        }

        if (mobile.isEmpty()){
            tlMobile.error = resources.getString(R.string.alert_mobile)
            isValid = false
        } else {
            tlMobile.isErrorEnabled = false
        }

        if (description.isEmpty()){
            tlDescription.error = resources.getString(R.string.alert_description)
            isValid = false
        } else {
            tlDescription.isErrorEnabled = false
        }
        //endregion

        var bitmap = (((ivProfile.drawable) as BitmapDrawable).bitmap)

        picture = getImage(bitmap)

        Log.d("Picture", "Value: " + picture)

        if(isValid) {

            languages.add(mother)
            languages.add(learn)
            levels.add(level)

            val request = SignUpRequest(name, lastName, email, password, birthday, mobile, description, gender, country, picture, languages, wishes, levels)

            RetrofitClient.instance().userSignUp(request)
                .enqueue(object : Callback<LoginResponse> {
                    override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                        Toast.makeText(applicationContext, resources.getString(R.string.hint_login_no_internet), Toast.LENGTH_SHORT).show()
                    }
                    override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                        if(response.body()?.result!! == 200){
                            Toast.makeText(applicationContext, resources.getString(R.string.alert_register_success), Toast.LENGTH_LONG).show()
                            progressBar.visibility = View.INVISIBLE
                            startActivity(Intent(applicationContext, LoginActivity::class.java))
                        } else {
                            Toast.makeText(applicationContext, resources.getString(R.string.alert_error), Toast.LENGTH_LONG).show()
                            //Toast.makeText(applicationContext, name + " " + lastName + " " + email + " " + password + " " + birthday + " " + gender +" " + languages.toString() + levels.toString() + country.toString(), Toast.LENGTH_LONG).show()
                            progressBar.visibility = View.INVISIBLE
                            languages.removeAt(1)
                            languages.removeAt(0)
                            levels.removeAt(1)
                        }
                    }
                })
        }
        else{
            progressBar.visibility = View.INVISIBLE
        }
    }

}
