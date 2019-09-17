package android.example.birthday;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    Button play1;
    VideoView video1;
    MediaController medCtrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play1 =(Button) findViewById(R.id.play1Button);
        video1 =(VideoView) findViewById(R.id.video1View);
        medCtrl= new MediaController(this);

    }

    public void playVideo1(View view){
        String video1Path;
        video1Path = "android.resource://android.example.birthday/"+R.raw.birthday;
        Uri uri=Uri.parse(video1Path);
        video1.setVideoURI(uri);
        video1.setMediaController(medCtrl);
        medCtrl.setAnchorView(video1);
        video1.start();

    }
}
