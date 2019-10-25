package pe.edu.upc.swap.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u0018\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\'J\u0018\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\b\b\u0001\u0010\f\u001a\u00020\u000fH\'\u00a8\u0006\u0010"}, d2 = {"Lpe/edu/upc/swap/data/network/Api;", "", "listLesson", "Lretrofit2/Call;", "", "Lpe/edu/upc/swap/data/network/model/Lesson;", "token", "", "listTeachers", "Lpe/edu/upc/swap/data/network/model/Teacher;", "userLogin", "Lpe/edu/upc/swap/data/network/model/LoginResponse;", "request", "Lpe/edu/upc/swap/data/network/model/LoginRequest;", "userSignUp", "Lpe/edu/upc/swap/data/network/model/SignUpRequest;", "app_debug"})
public abstract interface Api {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/signIn")
    public abstract retrofit2.Call<pe.edu.upc.swap.data.network.model.LoginResponse> userLogin(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    pe.edu.upc.swap.data.network.model.LoginRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "authentication/signUp")
    public abstract retrofit2.Call<pe.edu.upc.swap.data.network.model.LoginResponse> userSignUp(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    pe.edu.upc.swap.data.network.model.SignUpRequest request);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "lesson/teachers")
    public abstract retrofit2.Call<java.util.List<pe.edu.upc.swap.data.network.model.Teacher>> listTeachers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "lesson/views")
    public abstract retrofit2.Call<java.util.List<pe.edu.upc.swap.data.network.model.Lesson>> listLesson(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token);
}