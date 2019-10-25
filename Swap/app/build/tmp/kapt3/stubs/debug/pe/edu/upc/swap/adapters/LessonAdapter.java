package pe.edu.upc.swap.adapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lpe/edu/upc/swap/adapters/LessonAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lpe/edu/upc/swap/adapters/LessonAdapter$PrototypeLesson;", "lessons", "", "Lpe/edu/upc/swap/data/network/model/Lesson;", "(Ljava/util/List;)V", "getLessons", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "PrototypeLesson", "app_debug"})
public final class LessonAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<pe.edu.upc.swap.adapters.LessonAdapter.PrototypeLesson> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<pe.edu.upc.swap.data.network.model.Lesson> lessons = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public pe.edu.upc.swap.adapters.LessonAdapter.PrototypeLesson onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    pe.edu.upc.swap.adapters.LessonAdapter.PrototypeLesson holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<pe.edu.upc.swap.data.network.model.Lesson> getLessons() {
        return null;
    }
    
    public LessonAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<pe.edu.upc.swap.data.network.model.Lesson> lessons) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lpe/edu/upc/swap/adapters/LessonAdapter$PrototypeLesson;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lpe/edu/upc/swap/adapters/LessonAdapter;Landroid/view/View;)V", "tvDay", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "tvDescription", "tvHour", "tvLesson", "tvStatus", "tvTask", "bindTo", "", "lesson", "Lpe/edu/upc/swap/data/network/model/Lesson;", "app_debug"})
    public final class PrototypeLesson extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.TextView tvDay = null;
        private final android.widget.TextView tvHour = null;
        private final android.widget.TextView tvDescription = null;
        private final android.widget.TextView tvTask = null;
        private android.widget.TextView tvLesson;
        private android.widget.TextView tvStatus;
        
        public final void bindTo(@org.jetbrains.annotations.NotNull()
        pe.edu.upc.swap.data.network.model.Lesson lesson) {
        }
        
        public PrototypeLesson(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}