package com.wq.slz_2;

import android.app.ListActivity;
import android.os.Bundle;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SimpleAdapterActivity extends ListActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.activity_main, new String[] { "tv_sjz_time",  "image_sjz_icon","iv_sjz_picture_1","tv_sjz_long" }, new int[] { R.id.tv_sjz_time, R.id.image_sjz_icon,R.id.iv_sjz_picture_1,R.id.tv_sjz_long });
        setListAdapter(adapter);
    }

    private List<Map<String, Object>> getData() {
        //map.put(参数名字,参数值)
        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("tv_sjz_time", "12:13:56");
        map.put("image_sjz_icon", R.drawable.timeline_green);
        map.put("iv_sjz_picture_1",R.drawable.qq);
        map.put("tv_sjz_long","四分钟");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("tv_sjz_time", "13:13:56");
        map.put("image_sjz_icon", R.drawable.timeline_green);
        map.put("iv_sjz_picture_1",R.drawable.qq);
        map.put("tv_sjz_long","五分钟");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("tv_sjz_time", "14:13:56");
        map.put("image_sjz_icon", R.drawable.timeline_green);
        map.put("iv_sjz_picture_1",R.drawable.qq);
        map.put("tv_sjz_long","六分钟");
        list.add(map);

        map = new HashMap<String, Object>();
        map.put("tv_sjz_time", "14:13:56");
        map.put("image_sjz_icon", R.drawable.timeline_green);
        map.put("iv_sjz_picture_1",null);
        map.put("tv_sjz_long","六分钟");
        list.add(map);

        return list;
    }

}