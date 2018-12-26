package com.example.apple.glideuse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import com.example.apple.glideuse.imageloader.ImageLoaderManager;

public class MainActivity extends AppCompatActivity {
    private ImageView ivDefault;
    private ImageView ivCircle;
    private ImageView ivRound;
    private ImageView ivSize;
    private ImageView ivBlur;
    private ImageView ivGif;
    private String url = "http://5b0988e595225.cdn.sohucs.com/images/20181129/b927a5afe1854667a5cf9b09dcebb1ee.jpeg";
    private String gifUrl = "https://upload-images.jianshu.io/upload_images/8669504-930fc652956b3f0e.gif";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        loadImage();
    }

    private void initView() {
        ivDefault = findViewById(R.id.iv_default);
        ivCircle = findViewById(R.id.iv_circle);
        ivRound = findViewById(R.id.iv_round);
        ivSize = findViewById(R.id.iv_size);
        ivBlur = findViewById(R.id.iv_blur);
        ivGif = findViewById(R.id.iv_gif);
    }

    private void loadImage() {
        ImageLoaderManager.loadImage(getApplicationContext(), url, ivDefault);

        ImageLoaderManager.loadCircleImage(getApplicationContext(), url, ivCircle);

        ImageLoaderManager.loadRoundImage(getApplicationContext(), url, ivRound, 20);

        ImageLoaderManager.loadSizeImage(getApplicationContext(), url, ivSize, 150, 150);

        ImageLoaderManager.loadBlurImage(getApplicationContext(), url, ivBlur, 10);

        ImageLoaderManager.loadGifImage(getApplicationContext(), gifUrl, ivGif);
    }
}
