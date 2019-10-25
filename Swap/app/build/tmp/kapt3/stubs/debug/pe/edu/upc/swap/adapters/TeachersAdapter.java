package pe.edu.upc.swap.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lpe/edu/upc/swap/adapters/TeachersAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpe/edu/upc/swap/adapters/TeachersAdapter$PrototypeTeacher;", "teachers", "", "Lpe/edu/upc/swap/data/network/model/Teacher;", "(Ljava/util/List;)V", "getTeachers", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PrototypeTeacher", "app_debug"})
public final class TeachersAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<pe.edu.upc.swap.adapters.TeachersAdapter.PrototypeTeacher> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<pe.edu.upc.swap.data.network.model.Teacher> teachers = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public pe.edu.upc.swap.adapters.TeachersAdapter.PrototypeTeacher onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    pe.edu.upc.swap.adapters.TeachersAdapter.PrototypeTeacher holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<pe.edu.upc.swap.data.network.model.Teacher> getTeachers() {
        return null;
    }
    
    public TeachersAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<pe.edu.upc.swap.data.network.model.Teacher> teachers) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0007*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lpe/edu/upc/swap/adapters/TeachersAdapter$PrototypeTeacher;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lpe/edu/upc/swap/adapters/TeachersAdapter;Landroid/view/View;)V", "ivPicture", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "tvDescriptor", "Landroid/widget/TextView;", "tvLanguage", "tvName", "bindTo", "", "teacher", "Lpe/edu/upc/swap/data/network/model/Teacher;", "app_debug"})
    public final class PrototypeTeacher extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView tvName = null;
        private final android.widget.TextView tvDescriptor = null;
        private final android.widget.TextView tvLanguage = null;
        private final android.widget.ImageView ivPicture = null;
        
        public final void bindTo(@org.jetbrains.annotations.NotNull()
        pe.edu.upc.swap.data.network.model.Teacher teacher) {
        }
        
        public PrototypeTeacher(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}