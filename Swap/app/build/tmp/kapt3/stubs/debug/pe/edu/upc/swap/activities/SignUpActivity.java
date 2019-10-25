package pe.edu.upc.swap.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020IJ\u0010\u0010J\u001a\u00020\u00172\u0006\u0010K\u001a\u00020LH\u0002J\b\u0010M\u001a\u00020GH\u0002J\"\u0010N\u001a\u00020G2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\b\u0010Q\u001a\u0004\u0018\u00010RH\u0014J\u0012\u0010S\u001a\u00020G2\b\u0010T\u001a\u0004\u0018\u00010UH\u0014J\u000e\u0010V\u001a\u00020G2\u0006\u0010H\u001a\u00020IJ\b\u0010W\u001a\u00020GH\u0014J\u000e\u0010X\u001a\u00020G2\u0006\u0010H\u001a\u00020IJ\b\u0010Y\u001a\u00020GH\u0002J\b\u0010Z\u001a\u00020GH\u0002J\b\u0010[\u001a\u00020GH\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n \u000b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0012\"\u0004\b&\u0010\u0014R\u001a\u0010\'\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0012\"\u0004\b,\u0010\u0014R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010/\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\u001a\u00102\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0012\"\u0004\b4\u0010\u0014R\u001a\u00105\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\u0019\"\u0004\b7\u0010\u001bR\u001a\u00108\u001a\u000209X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020?X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\\"}, d2 = {"Lpe/edu/upc/swap/activities/SignUpActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "PICK_IMAGE_REQUEST", "", "getPICK_IMAGE_REQUEST", "()I", "setPICK_IMAGE_REQUEST", "(I)V", "c", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "country", "getCountry", "setCountry", "countryValid", "", "getCountryValid", "()Z", "setCountryValid", "(Z)V", "d", "gender", "", "getGender", "()Ljava/lang/String;", "setGender", "(Ljava/lang/String;)V", "genderValid", "getGenderValid", "setGenderValid", "languages", "", "learn", "getLearn", "setLearn", "learnValid", "getLearnValid", "setLearnValid", "level", "getLevel", "setLevel", "levelValid", "getLevelValid", "setLevelValid", "levels", "m", "mother", "getMother", "setMother", "motherValid", "getMotherValid", "setMotherValid", "picture", "getPicture", "setPicture", "progressBar", "Landroid/widget/ProgressBar;", "getProgressBar", "()Landroid/widget/ProgressBar;", "setProgressBar", "(Landroid/widget/ProgressBar;)V", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "setToolbar", "(Landroidx/appcompat/widget/Toolbar;)V", "wishes", "y", "clickBirthday", "", "view", "Landroid/view/View;", "getImage", "bitmap", "Landroid/graphics/Bitmap;", "getWish", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSignUp", "onStart", "showFileImage", "spinnerCountry", "spinnerGender", "spinnerLanguage", "app_debug"})
public final class SignUpActivity extends androidx.appcompat.app.AppCompatActivity {
    private int PICK_IMAGE_REQUEST;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String picture;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String gender;
    private int country;
    private int learn;
    private int mother;
    private int level;
    private final java.util.Calendar c = null;
    private final int y = 0;
    private final int m = 0;
    private final int d = 0;
    private java.util.List<java.lang.Integer> languages;
    private java.util.List<java.lang.Integer> levels;
    private java.util.List<java.lang.Integer> wishes;
    private boolean motherValid;
    private boolean learnValid;
    private boolean levelValid;
    private boolean genderValid;
    private boolean countryValid;
    @org.jetbrains.annotations.NotNull()
    public androidx.appcompat.widget.Toolbar toolbar;
    @org.jetbrains.annotations.NotNull()
    public android.widget.ProgressBar progressBar;
    private java.util.HashMap _$_findViewCache;
    
    public final int getPICK_IMAGE_REQUEST() {
        return 0;
    }
    
    public final void setPICK_IMAGE_REQUEST(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPicture() {
        return null;
    }
    
    public final void setPicture(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGender() {
        return null;
    }
    
    public final void setGender(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getCountry() {
        return 0;
    }
    
    public final void setCountry(int p0) {
    }
    
    public final int getLearn() {
        return 0;
    }
    
    public final void setLearn(int p0) {
    }
    
    public final int getMother() {
        return 0;
    }
    
    public final void setMother(int p0) {
    }
    
    public final int getLevel() {
        return 0;
    }
    
    public final void setLevel(int p0) {
    }
    
    public final boolean getMotherValid() {
        return false;
    }
    
    public final void setMotherValid(boolean p0) {
    }
    
    public final boolean getLearnValid() {
        return false;
    }
    
    public final void setLearnValid(boolean p0) {
    }
    
    public final boolean getLevelValid() {
        return false;
    }
    
    public final void setLevelValid(boolean p0) {
    }
    
    public final boolean getGenderValid() {
        return false;
    }
    
    public final void setGenderValid(boolean p0) {
    }
    
    public final boolean getCountryValid() {
        return false;
    }
    
    public final void setCountryValid(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    public final void setToolbar(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.ProgressBar getProgressBar() {
        return null;
    }
    
    public final void setProgressBar(@org.jetbrains.annotations.NotNull()
    android.widget.ProgressBar p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void spinnerGender() {
    }
    
    private final void spinnerCountry() {
    }
    
    private final void spinnerLanguage() {
    }
    
    private final java.lang.String getImage(android.graphics.Bitmap bitmap) {
        return null;
    }
    
    public final void showFileImage(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void clickBirthday(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    private final void getWish() {
    }
    
    public final void onSignUp(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public SignUpActivity() {
        super();
    }
}