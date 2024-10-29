public class Mood {
    public String moodReport (String[] moods) {
        // Initialize string variable for mood
        String neutralMood = "NEUTRAL";

        // Initialize variable counts for likes and dislikes
        int likes = 0;
        int dislikes = 0;

        // Checking condition for no buttons pressed
        if (moods.length == 0) {
            System.out.println("No buttons have been pressed");
            return neutralMood;
        }

        // iterate through moods array to increment likes and dislikes
        for (String moodElement: moods) {
            if (moodElement.equals("LIKE")) {
                likes++;
            } else if (moodElement.equals("DISLIKE")) {
                dislikes++;
            }
        }

        // Checking that we have more likes
        if (likes > dislikes) {
            if (likes % 2 == 0 ) {
                if (dislikes % 2 > 0) {
                    return "DISLIKE";
                }
                return "DISLIKE";
            } else {
                return "LIKE";
            }
        }

        // Checking that we have more dislikes
        if (likes < dislikes) {
            if (dislikes % 2 == 0) {
                return neutralMood;
            } else {
                return "DISLIKE";
            }
        }

        //
        if (likes % 2 == 0) {
            if (dislikes % 2 > 0) {
                return "DISLIKE";
            }
        }
        return neutralMood;
    }
}
