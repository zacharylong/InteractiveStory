package com.zacharylong.interactivestory.model;

import com.zacharylong.interactivestory.R;

public class Story {
    private Page[] pages;

    public Story() {
        pages = new Page[7];

pages[0] = new Page(R.drawable.page0,
        R.string.page0,
        new Choice(R.string.page0_choice1, 1),
        new Choice(R.string.page0_choice2, 2));
    }

    public Page getPage(int pageNumber) {
        if (pageNumber >= pages.length) {
            pageNumber = 0;
        }
        return pages[pageNumber];

    }
}
