package com.example.selectview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class SimpleAdapterTestActivity extends AppCompatActivity {
    //두 줄 텍스트로 리스트뷰를 구성
    ArrayList<HashMap<String,String>> datalist =
                            new ArrayList<HashMap<String, String>>();
    ListView listview;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_adapter_test);
        listview = findViewById(R.id.simplelist);
        txt = findViewById(R.id.simpleTxt);
        //리스트를 구성할 샘플 데이터 준비
        HashMap<String,String> item = new HashMap<String,String>();
        item.put("name","박준범");
        item.put("telnum","01040180673");
        datalist.add(item);

        item = new HashMap<String,String>();
        item.put("name","장동건");
        item.put("telnum","0101231235");
        datalist.add(item);

        item = new HashMap<String,String>();
        item.put("name","BTS");
        item.put("telnum","0107675676");
        datalist.add(item);

        item = new HashMap<String,String>();
        item.put("name","홍길동");
        item.put("telnum","01049909999");
        datalist.add(item);

        item = new HashMap<String,String>();
        item.put("name","이민호");
        item.put("telnum","01077777777");
        datalist.add(item);

        SimpleAdapter adapter = new SimpleAdapter(this,
                            datalist , // HashMap으로 구성된 데이터가 저장된 리스트
                            android.R.layout.simple_list_item_2, // row 디자인
                            new String[]{"name","telnum"} , // HashMap에 저장된 key목록
                            new int[]{android.R.id.text1,android.R.id.text2}); //위에서 정의한 HashMap데이터를 어떤 view에 출력할 것인지
                                                                              //키의 순서와 동일한 리소스아이디 순서를 갖도록 정의하기
        listview.setAdapter(adapter);
    }
}