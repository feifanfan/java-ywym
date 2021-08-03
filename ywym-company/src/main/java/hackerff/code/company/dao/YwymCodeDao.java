package hackerff.code.company.dao;

import com.hackerff.code.model.YwymCode;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author hackerff
 * @version 1.0
 * @description: TODO
 * @date 2021/8/3 10:19
 */
public interface YwymCodeDao {
    int insertList(@Param("list") List<YwymCode> codeList);
}
