package com.github.programInChinese.模型;

import static com.github.program_in_chinese.junit4_in_chinese.断言类.相等;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class 人物测试类 {

  人物类 小明;
  人物类 小王;
  人物类 小红;
  人物类 小黑;
  
  @Before
  public void setUp() throws Exception {
    小明 = new 人物类("小明");
    小王 = new 人物类("小王");
    小红 = new 人物类("小红");
    小黑 = new 人物类("小黑");
  }
  
  @Test
  public void 单辈关系() {
    小明.置家庭关系(小王, 关系类.爸爸);

    相等(关系类.爸爸, 小明.取家庭关系(小王));
    // TODO: 相反关系: 相等(关系类.儿子/女儿, 小王.取家庭关系(小明));
  }

  @Test
  public void 隔辈关系() {
    小明.置家庭关系(小王, 关系类.爸爸);
    小王.置家庭关系(小红, 关系类.爸爸);

    相等(关系类.爷爷, 小明.取家庭关系(小红));
  }
  
  @Test
  public void 关系链_距离2() {
    小明.置家庭关系(小王, 关系类.爸爸);
    小红.置家庭关系(小明, 关系类.哥哥);
    
    // 小红是小王的爸爸的哥哥
    相等(Arrays.asList(关系类.爸爸, 关系类.哥哥), 小红.获取关系链(小王));
  }
  
  @Test
  public void 关系链_距离3() {
    小明.置家庭关系(小王, 关系类.爸爸);
    小红.置家庭关系(小明, 关系类.哥哥);
    小黑.置家庭关系(小红, 关系类.儿子);
    
    相等(Arrays.asList(关系类.爸爸, 关系类.哥哥, 关系类.儿子), 小黑.获取关系链(小王));
  }
}
