package id.ac.poliban.mi.hendra.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //menentukan layout yang digunakan oleh MainActivity
        //ada di folder res/layout
        setContentView(R.layout.activity_main);

        //hubungkan view/komponen yang ada di layout
        //ke object dari kelas yang sesuai dengan view/komponen tersebut
        Button btFirst =findViewById(R.id.btfirst);
        Button btSecond =findViewById(R.id.btsecond);
        Button btThird =findViewById(R.id.btthird);
        Button btFourth =findViewById(R.id.btFourth);

        // memasang event listener kepada masing -masing object button
        //dengan parameter this(object dari kelas sekarang)

        btFirst.setOnClickListener(this);
        btSecond.setOnClickListener(this);
        btThird.setOnClickListener(this);
        btFourth.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (view,getId()){
            case R.id.btfirst :
                Toast.makeText(this, "Hei pian lagi memicik tombol satu", Toast.LENGTH_SHORT).show();
                break;

                case R.id.btsecond :
                Toast.makeText(this, "Hei pian lagi memicik tombol dua", Toast.LENGTH_SHORT).show();
                break;

                case R.id.btthird :
                Toast.makeText(this, "Hei pian lagi memicik tombol Tiga", Toast.LENGTH_SHORT).show();
                break;

                case R.id.btFourth :
                Toast.makeText(this, "Hei pian lagi memicik tombol empat", Toast.LENGTH_SHORT).show();
                break;


        }

    }
}
