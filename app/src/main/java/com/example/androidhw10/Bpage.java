package com.example.androidhw10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Bpage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bpage);

        final int ApageChoose;
        Intent Adata = getIntent();

        Boolean CBbtn;
        Intent CpageBack = getIntent();
        CBbtn = CpageBack.getBooleanExtra("CBclick", false);
        if (CBbtn == true) {
            ApageChoose = CpageBack.getIntExtra("CBmonth", 0);
        } else {
            ApageChoose = Adata.getIntExtra("month", 0);
        }


        final EditText inputnum = (EditText) findViewById(R.id.inputnum);
        Button BtoCbtn = (Button) findViewById((R.id.BtoCbtn));
        final Button BtoAbtn = (Button) findViewById(R.id.BtoAbtn);


        switch (ApageChoose) {
            case 1:
                winnumtext("21735266", "91874254", "56065209", "05739340", "69001612", "591", "342", "");
                break;
            case 3:
                winnumtext("12342326", "80740977", "36822639", "38786238", "87204837", "991", "715", "");
                break;
            case 5:
                winnumtext("20048019", "02142605", "21240109", "78323535", "18549847", "706", "574", "");
                break;
            case 7:
                winnumtext("73372972", "22315462", "91903003", "16228722", "03270598", "163", "983", "814");
                break;
            case 9:
                winnumtext("96363025", "69095110", "96745865", "98829035", "45984442", "292", "650", "230");
                break;
            case 11:
                winnumtext("88515559", "47551146", "83513656", "85250862", "61472404", "185", "079", "442");
                break;
        }

        BtoCbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (inputnum.getText().toString().length() > 8) {
                    Toast warn = Toast.makeText(Bpage.this, "你輸入的號碼太長!", Toast.LENGTH_SHORT);
                    warn.show();
                } else if (inputnum.getText().toString().length() < 8) {
                    Toast warn = Toast.makeText(Bpage.this, "你輸入的號碼太短!", Toast.LENGTH_SHORT);
                    warn.show();
                } else if (!("".equals(inputnum.getText().toString())) && inputnum.getText().toString().length() == 8) {
                    switch (ApageChoose) {
                        case 1:
                            result("21735266", "91874254", "56065209", "05739340", "69001612", "591", "342", "");
                            break;
                        case 3:
                            result("12342326", "80740977", "36822639", "38786238", "87204837", "991", "715", "");
                            break;
                        case 5:
                            result("20048019", "02142605", "21240109", "78323535", "18549847", "706", "574", "");
                            break;
                        case 7:
                            result("73372972", "22315462", "91903003", "16228722", "03270598", "163", "983", "814");
                            break;
                        case 9:
                            result("96363025", "69095110", "96745865", "98829035", "45984442", "292", "650", "230");
                            break;
                        case 11:
                            result("88515559", "47551146", "83513656", "85250862", "61472404", "185", "079", "442");
                            break;
                    }

                }
            }
        });

        BtoAbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BtoA = new Intent(Bpage.this, MainActivity.class);
                startActivity(BtoA);
            }
        });

    }

    public void winnumtext(String sa1, String sa2, String fp1, String fp2, String fp3, String plus1, String plus2, String plus3) {
        TextView winnum1 = (TextView) findViewById(R.id.winnum1);
        if ("".equals(plus3)) {
            winnum1.setText("特別獎\n" + sa1 + "\n特獎\n" + sa2 + "\n頭獎\n" + fp1 + "\n" + fp2 + "\n" + fp3 + "\n增開六獎\n" + plus1 + "、" + plus2);
        }
        if (!("".equals(plus3))) {
            winnum1.setText("特別獎\n" + sa1 + "\n特獎\n" + sa2 + "\n頭獎\n" + fp1 + "\n" + fp2 + "\n" + fp3 + "\n增開六獎\n" + plus1 + "、" + plus2 + "、" + plus3);
        }
    }

    public void result(String sa1, String sa2, String fp1, String fp2, String fp3, String plus1, String plus2, String plus3) {
        EditText inputnum = (EditText) findViewById(R.id.inputnum);

        Intent bonus = new Intent(Bpage.this, Cpage.class);
        if (sa1.contains(inputnum.getText().toString())) {
            bonus.putExtra("getprize", "恭喜您中了1000萬元!");
            startActivity(bonus);
        } else if (sa2.contains(inputnum.getText().toString())) {
            bonus.putExtra("getprize", "恭喜您中了200萬元!");
            startActivity(bonus);
        } else if (fp1.contains(inputnum.getText().toString()) || fp2.contains(inputnum.getText().toString()) || fp3.contains(inputnum.getText().toString())) {
            bonus.putExtra("getprize", "恭喜您中了20萬元!");
            startActivity(bonus);
        } else if ((fp1.substring(1, 7).equals(inputnum.getText().toString().substring(1, 7)) || fp2.substring(1, 7).equals(inputnum.getText().toString().substring(1, 7)) || fp3.substring(1, 7).equals(inputnum.getText().toString().substring(1, 7)))) {
            bonus.putExtra("getprize", "恭喜您中了4萬元!");
            startActivity(bonus);

        } else if ((fp1.substring(2, 7).equals(inputnum.getText().toString().substring(2, 7)) || fp2.substring(2, 7).equals(inputnum.getText().toString().substring(2, 7)) || fp3.substring(2, 7).equals(inputnum.getText().toString().substring(2, 7)))) {
            bonus.putExtra("getprize", "恭喜您中了1萬元!");
            startActivity(bonus);
        } else if ((fp1.substring(3, 7).equals(inputnum.getText().toString().substring(3, 7)) || fp2.substring(3, 7).equals(inputnum.getText().toString().substring(3, 7)) || fp3.substring(3, 7).equals(inputnum.getText().toString().substring(3, 7)))) {
            bonus.putExtra("getprize", "恭喜您中了4千元!");
            startActivity(bonus);
        } else if ((fp1.substring(4, 7).equals(inputnum.getText().toString().substring(4, 7)) || fp2.substring(4, 7).equals(inputnum.getText().toString().substring(4, 7)) || fp3.substring(4, 7).equals(inputnum.getText().toString().substring(4, 7)))) {
            bonus.putExtra("getprize", "恭喜您中了1000元!");
            startActivity(bonus);
        } else if (fp1.substring(5, 7).equals(inputnum.getText().toString().substring(5, 7)) || fp2.substring(5, 7).equals(inputnum.getText().toString().substring(5, 7)) || fp3.substring(5, 7).equals(inputnum.getText().toString().substring(5, 7)) || plus1.substring(0, 2).equals(inputnum.getText().toString().substring(5, 7)) || plus2.substring(0, 3).equals(inputnum.getText().toString().substring(5, 7)) || plus3.substring(0, 3).equals(inputnum.getText().toString().substring(5, 7)))
            bonus.putExtra("getprize", "恭喜您中了200元!");
        startActivity(bonus);
    }
}
