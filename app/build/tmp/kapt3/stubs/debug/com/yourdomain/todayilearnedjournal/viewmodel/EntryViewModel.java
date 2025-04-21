package com.yourdomain.todayilearnedjournal.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bJ$\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0014\u0010\u001a\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00150\u001bJ\u0006\u0010\u001c\u001a\u00020\u0015J\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/yourdomain/todayilearnedjournal/viewmodel/EntryViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_entries", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/yourdomain/todayilearnedjournal/data/Entry;", "db", "Lcom/yourdomain/todayilearnedjournal/data/AppDatabase;", "entries", "Lkotlinx/coroutines/flow/StateFlow;", "getEntries", "()Lkotlinx/coroutines/flow/StateFlow;", "entryDao", "Lcom/yourdomain/todayilearnedjournal/data/EntryDao;", "passphrase", "", "kotlin.jvm.PlatformType", "deleteEntry", "", "entry", "getEntryForDate", "date", "", "onLoaded", "Lkotlin/Function1;", "loadEntries", "saveEntry", "app_debug"})
public final class EntryViewModel extends androidx.lifecycle.AndroidViewModel {
    private final byte[] passphrase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.yourdomain.todayilearnedjournal.data.AppDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private final com.yourdomain.todayilearnedjournal.data.EntryDao entryDao = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.yourdomain.todayilearnedjournal.data.Entry>> _entries = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.util.List<com.yourdomain.todayilearnedjournal.data.Entry>> entries = null;
    
    public EntryViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.yourdomain.todayilearnedjournal.data.Entry>> getEntries() {
        return null;
    }
    
    public final void loadEntries() {
    }
    
    public final void getEntryForDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.yourdomain.todayilearnedjournal.data.Entry, kotlin.Unit> onLoaded) {
    }
    
    public final void saveEntry(@org.jetbrains.annotations.NotNull()
    com.yourdomain.todayilearnedjournal.data.Entry entry) {
    }
    
    public final void deleteEntry(@org.jetbrains.annotations.NotNull()
    com.yourdomain.todayilearnedjournal.data.Entry entry) {
    }
}