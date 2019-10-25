package pe.edu.upc.swap.fragments;

import java.lang.System;

/**
 * A simple [Fragment] subclass.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \'2\u00020\u0001:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010&\u001a\u00020$H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\r\"\u0004\b\u001a\u0010\u000f\u00a8\u0006("}, d2 = {"Lpe/edu/upc/swap/fragments/LessonFragment;", "Landroidx/fragment/app/Fragment;", "()V", "lessonAdapter", "Lpe/edu/upc/swap/adapters/LessonAdapter;", "getLessonAdapter", "()Lpe/edu/upc/swap/adapters/LessonAdapter;", "setLessonAdapter", "(Lpe/edu/upc/swap/adapters/LessonAdapter;)V", "lessons", "", "Lpe/edu/upc/swap/data/network/model/Lesson;", "getLessons", "()Ljava/util/List;", "setLessons", "(Ljava/util/List;)V", "token", "", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "users", "", "Lpe/edu/upc/swap/data/database/model/User;", "getUsers", "setUsers", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "searchTeachers", "Companion", "app_debug"})
public final class LessonFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    public pe.edu.upc.swap.adapters.LessonAdapter lessonAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<pe.edu.upc.swap.data.network.model.Lesson> lessons;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<pe.edu.upc.swap.data.database.model.User> users;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String token;
    private static final java.lang.String ERROR_TAG = "Error";
    public static final pe.edu.upc.swap.fragments.LessonFragment.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final pe.edu.upc.swap.adapters.LessonAdapter getLessonAdapter() {
        return null;
    }
    
    public final void setLessonAdapter(@org.jetbrains.annotations.NotNull()
    pe.edu.upc.swap.adapters.LessonAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<pe.edu.upc.swap.data.network.model.Lesson> getLessons() {
        return null;
    }
    
    public final void setLessons(@org.jetbrains.annotations.NotNull()
    java.util.List<pe.edu.upc.swap.data.network.model.Lesson> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<pe.edu.upc.swap.data.database.model.User> getUsers() {
        return null;
    }
    
    public final void setUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<pe.edu.upc.swap.data.database.model.User> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getToken() {
        return null;
    }
    
    public final void setToken(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void searchTeachers() {
    }
    
    public LessonFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lpe/edu/upc/swap/fragments/LessonFragment$Companion;", "", "()V", "ERROR_TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}