package exr.at.com.firebasechat.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import exr.at.com.firebasechat.R;

public class robot_or_user extends AppCompatActivity {
    Button chat_with_robot;
    Button chat_with_users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_robot_or_user);

        chat_with_robot = (Button) findViewById(R.id.robot_button);

        chat_with_users = (Button) findViewById(R.id.user_button);

        chat_with_robot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(robot_or_user.this,User_vs_robot.class);
                startActivity(i1);
            }
        });
        chat_with_users.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(robot_or_user.this,SplashActivity.class);
                startActivity(i1);
            }
        });

    }
}
