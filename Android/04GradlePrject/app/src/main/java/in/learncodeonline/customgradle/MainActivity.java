package in.learncodeonline.customgradle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View view) {
        switch (view.getId()) {
            case R.id.errorButton:
                Toasty.error(this, "Login failed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.successButton:
                Toasty.success(this, "Login success", Toast.LENGTH_SHORT).show();
                break;
            case R.id.infoButton:
                Toasty.info(this, "Information", Toast.LENGTH_SHORT).show();
                break;
            case R.id.warningButton:
                Toasty.warning(this, "OPPsssS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageButton:
                Toasty.normal(this, "Project Done", Toast.LENGTH_SHORT, ContextCompat.getDrawable(this, R.drawable.ic_cloud)).show();
                break;

        }
    }
}
