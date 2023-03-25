package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecycler_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Data_model [] my_data = new Data_model[]{
                new Data_model("Những sự thật về mèo" , " Một sự thật khó tin của loài mèo chính là chúng có thể sống sót nếu bị rơi từ độ cao 90 mét. Có được đặc tính này chính là do khả năng bay nhảy của chúng. Nghiên cứu này được phát hiện vào những năm 1980.", R.drawable.meoanh),
                new Data_model("Xấu xí và trụi lông, vì sao giống mèo nhân sư hút hồn giới trẻ?", "(VTC News) - Trụi lông và xấu xí nhưng mèo nhân sư (Sphynx) là một trong những giống mèo đắt nhất thế giới, và khiến nhiều bạn trẻ Việt Nam mê mẩn.",R.drawable.meoxau),
                new Data_model("Lệnh trừ phạt cho mèo" , "Liên đoàn Mèo quốc tế (FIFe), một xã hội yêu thích mèo, hôm thứ Tư đã áp đặt các hạn chế đối với mèo Nga xuất khẩu ra ngoài nước Nga.", R.drawable.img),
                new Data_model("Cách trị nấm cho mèo", "Biết cách trị nấm cho mèo đúng cách sẽ tránh làm tình trạng nấm trở nặng hơn và giúp thú cưng nhanh chóng khỏe mạnh. ", R.drawable.img_1),
                new Data_model("Top 7 mẫu đồ mặc cho mèo siêu đáng yêu", "Những năm trở lại đây, set quần áo dễ thương dành cho thú cưng ngày càng trở nên phổ biến. Trong đó, nhiều mẫu đồ mặc cho mèo độc - lạ được các sen nhiệt tình săn lùng, tìm mua.", R.drawable.img_2),

        };


        myrecycler_view = findViewById(R.id.my_recycler_view);
        Data_Adapter myadapter= new Data_Adapter(my_data);
        myrecycler_view.setLayoutManager(new LinearLayoutManager(this));
        myrecycler_view.setAdapter(myadapter);
    }
}