package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import static ca.ualberta.cs.lonelytwitter.R.id.textView;

public class EditTweetActivity extends Activity {

    private static TextView tweetMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);

        Intent intent = getIntent();
        String tweetText = intent.getExtras().getString("Tweet");

        tweetMessage = (TextView) findViewById(R.id.textView);
        tweetMessage.setText(tweetText);

    }
}
