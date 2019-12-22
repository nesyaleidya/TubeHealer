package com.example.tubehealer;

import android.content.SearchRecentSuggestionsProvider;

public class  MySuggestionProvider extends SearchRecentSuggestionsProvider {

    public final static String AUTHORITY = "com.example.tubehealer.MySuggestionProvider";
    public final static int MODE = DATABASE_MODE_QUERIES;

    public MySuggestionProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }

}
