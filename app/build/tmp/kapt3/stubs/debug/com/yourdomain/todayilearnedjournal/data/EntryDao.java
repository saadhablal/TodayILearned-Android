package com.yourdomain.todayilearnedjournal.data;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\u00a7@\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u00a7@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/yourdomain/todayilearnedjournal/data/EntryDao;", "", "deleteEntry", "", "entry", "Lcom/yourdomain/todayilearnedjournal/data/Entry;", "(Lcom/yourdomain/todayilearnedjournal/data/Entry;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllEntries", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEntryByDate", "date", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertEntry", "app_debug"})
@androidx.room.Dao()
public abstract interface EntryDao {
    
    @androidx.room.Query(value = "SELECT * FROM entries ORDER BY date DESC")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllEntries(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.yourdomain.todayilearnedjournal.data.Entry>> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM entries WHERE date = :date LIMIT 1")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getEntryByDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.yourdomain.todayilearnedjournal.data.Entry> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertEntry(@org.jetbrains.annotations.NotNull()
    com.yourdomain.todayilearnedjournal.data.Entry entry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteEntry(@org.jetbrains.annotations.NotNull()
    com.yourdomain.todayilearnedjournal.data.Entry entry, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}