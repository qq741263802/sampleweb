

import com.sample.ssm.mapper.UserInfoMapper;
import com.sample.ssm.model.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
/**
 * @author lhm
 * @date 2020/8/8 16:22
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserInfoMapperTest {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Test
    public void testSelectOne(){
        UserInfo userInfo = userInfoMapper.selectOne(1);
        System.out.println(userInfo);
    }
}
