package cat.dam.andy.radiogroups;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.BundleCompat;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static RelativeLayout mainLayout;
    static TextView configuram;
    static LinearLayout Linear1;
    static RadioGroup CanviarLayout;
    static RadioGroup TamanyLletra;
    static RadioGroup ColorLletra;
    static RadioGroup ColorFonsLletra;
    static RadioGroup ColorFons;
    static TextView tv_Tamanylletra;
    static TextView tv_ColorLletra;
    static TextView tv_ColorFonsLletra;
    static TextView tv_ColorFons;
    static Button Aplicar;
    static RadioButton Lletra1;
    static RadioButton Lletra2;
    static RadioButton Lletra3;
    static RadioButton Lletra4;
    static RadioButton Lletra5;

    /**
     * Funcio per canviar el tamany del titol
     */
    public void CanviarTamany(){

        final int idTamanyLletra = TamanyLletra.getCheckedRadioButtonId();

        switch (idTamanyLletra){

            case R.id.RadioButton_Lletra1:
                configuram.setTextSize(10);
                break;

            case R.id.RadioButton_Lletra2:
                configuram.setTextSize(20);
                break;

            case R.id.RadioButton_Lletra3:
                configuram.setTextSize(30);
                break;

            case R.id.RadioButton_Lletra4:
                configuram.setTextSize(40);
                break;

            case R.id.RadioButton_Lletra5:
                configuram.setTextSize(50);
                break;

        }
    }

    /**
     * Funcio per canviar el color de el titol
     */
    public void CanviarColorLletra(){

        final int idColorLletra = ColorLletra.getCheckedRadioButtonId();

        switch (idColorLletra){

            case R.id.RadioButton_colorLletra1:
                configuram.setTextColor(Color.RED);
                break;

            case R.id.RadioButton_colorLletra2:
                configuram.setTextColor(Color.BLUE);
                break;

            case R.id.RadioButton_colorLletra3:
                configuram.setTextColor(Color.WHITE);
                break;

            case R.id.RadioButton_colorLletra4:
                configuram.setTextColor(Color.BLACK);
                break;

        }
    }

    /**
     * Funcio per canviar el color del fons del titol
     */
    public void CanviarColorFons(){

        final int idColorFonsLletra = ColorFonsLletra.getCheckedRadioButtonId();

        switch (idColorFonsLletra){

            case R.id.RadioButton_colorFonslletra1:
                Linear1.setBackgroundColor(Color.RED);
                break;

            case R.id.RadioButton_colorFonslletra2:
                Linear1.setBackgroundColor(Color.BLUE);
                break;

            case R.id.RadioButton_colorFonslletra3:
                Linear1.setBackgroundColor(Color.WHITE);
                break;

            case R.id.RadioButton_colorFonslletra4:
                Linear1.setBackgroundColor(Color.BLACK);
                break;
        }
    }

    /**
     * Funcio per canviar el color del fons del layout
     */
    public void CanviarFonsLayout(){

        final int idColorFons = ColorFons.getCheckedRadioButtonId();

        switch (idColorFons){

            case R.id.RadioButton_colorFons1:
                mainLayout.setBackgroundColor(Color.RED);
                break;

            case R.id.RadioButton_colorFons2:
                mainLayout.setBackgroundColor(Color.GREEN);
                break;

            case R.id.RadioButton_colorFons3:
                mainLayout.setBackgroundColor(Color.BLUE);
                break;

            case R.id.RadioButton_colorFons4:
                mainLayout.setBackgroundColor(Color.WHITE);
                break;

            case R.id.RadioButton_colorFons5:
                mainLayout.setBackgroundColor(Color.BLACK);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainLayout = (RelativeLayout) findViewById(R.id.mainLayout);
        CanviarLayout = (RadioGroup) findViewById(R.id.radioGroup_Layouts); //RadioGroup per canviar a editar tamany text o colors
        Linear1 = (LinearLayout) findViewById(R.id.Linear1);
        configuram = (TextView) findViewById(R.id.titol_configuram); //TextView que es el titol dins del LinearLayout

        //RadioGroups
        TamanyLletra = (RadioGroup) findViewById(R.id.radioGroup_lletra1);

        ColorLletra = (RadioGroup) findViewById(R.id.radioGroup_colorLletra);
        ColorFonsLletra = (RadioGroup) findViewById(R.id.radioGroup_colorFonslletra);
        ColorFons = (RadioGroup) findViewById(R.id.radioGroup_colorFons);

        //TextViews
        tv_Tamanylletra = (TextView) findViewById(R.id.tv_lletra1);
        tv_ColorLletra = (TextView) findViewById(R.id.tv_colorlletra);
        tv_ColorFonsLletra = (TextView) findViewById(R.id.tv_colorFonslletra);
        tv_ColorFons = (TextView) findViewById(R.id.tv_colorFons);


        //Butto per aplicar canvis
        Aplicar = (Button) findViewById(R.id.Aplicar);

        CanviarLayout.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup radioGroup, int i) {

                        final int id = CanviarLayout.getCheckedRadioButtonId();

                        switch (id){

                            case R.id.radioButton_Layout_Lletres:

                                    tv_Tamanylletra.setVisibility(View.VISIBLE);
                                    TamanyLletra.setVisibility(View.VISIBLE);

                                    tv_ColorFons.setVisibility(View.INVISIBLE);
                                    ColorFons.setVisibility(View.INVISIBLE);

                                    tv_ColorFonsLletra.setVisibility(View.INVISIBLE);
                                    ColorFonsLletra.setVisibility(View.INVISIBLE);

                                    tv_ColorLletra.setVisibility(View.INVISIBLE);
                                    ColorLletra.setVisibility(View.INVISIBLE);

                                break;

                            case R.id.radioButton_Layout_Colors:

                                tv_Tamanylletra.setVisibility(View.INVISIBLE);
                                TamanyLletra.setVisibility(View.INVISIBLE);

                                tv_ColorFons.setVisibility(View.VISIBLE);
                                ColorFons.setVisibility(View.VISIBLE);

                                tv_ColorFonsLletra.setVisibility(View.VISIBLE);
                                ColorFonsLletra.setVisibility(View.VISIBLE);

                                tv_ColorLletra.setVisibility(View.VISIBLE);
                                ColorLletra.setVisibility(View.VISIBLE);

                                break;

                            default:

                                break;
                        }
                    }
                });

        Aplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CanviarTamany();

                CanviarColorLletra();

                CanviarColorFons();

                CanviarFonsLayout();

            }
        });



    }

}