package icu.lijiaqi.server.exception;

import icu.lijiaqi.server.pojo.RespBean;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理
 *
 * @author revelvy
 * @since 1.0.0
 */
@RestControllerAdvice
public class GlobalException {

	@ExceptionHandler(SQLException.class)
	public RespBean mySqlException(SQLException e){
		//删除存在外键的数据
		if (e instanceof SQLIntegrityConstraintViolationException){
			return RespBean.error("有关联数据，谁也不能动！我说的");
		}
		return RespBean.error("数据库异常，操作失败！");
	}

}