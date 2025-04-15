# Today I Learned Journal (Android)

## Project Structure

```
app/
└── src/
    └── main/
        ├── java/com/yourdomain/todayilearnedjournal/
        │   ├── data/
        │   │   ├── Entry.kt
        │   │   ├── EntryDao.kt
        │   │   └── AppDatabase.kt
        │   ├── viewmodel/
        │   │   └── EntryViewModel.kt
        │   ├── ui/
        │   │   ├── MainScreen.kt
        │   │   └── theme/
        │   │       └── TodayILearnedJournalTheme.kt
        │   └── MainActivity.kt
        └── res/
            └── values/
                └── themes.xml (auto)
```

## Setup Instructions

1. Open Android Studio and create a new project (Empty Activity):
   - Name: TodayILearnedJournal
   - Package: com.yourdomain.todayilearnedjournal
   - Language: Kotlin
   - Min SDK: 26 or higher

2. Copy the provided Kotlin files into the correct directories under `java/com/yourdomain/todayilearnedjournal/` as shown above.

3. Update your `app/build.gradle` dependencies as described in the instructions.

4. Sync Gradle and run the app!

---

## Next Steps
- All code files are provided in this repo. Copy them into your Android Studio project.
- If you want to add features (calendar, streaks, export/import), just ask!
