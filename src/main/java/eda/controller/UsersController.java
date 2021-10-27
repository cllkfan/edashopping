package eda.controller;


import eda.domain.Users;
import eda.service.UsersService;
import eda.utils.MD5Util;
import eda.utils.ResponseEntity;
import eda.utils.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author TaoMinghui
 * @create 2021-10-24 23:12
 */
@RestController
@RequestMapping("/shopping")
public class UsersController {

    @Autowired
    private UsersService usersService;



    /**
     * 用户注册
     * @param users
     * @return
     */
    @RequestMapping("/user/reg")
    public ResponseEntity<Integer> reg(Users users) {
        Users users1 =new Users();
        users1.setUsername(users.getUsername());
        users1.setPwd(MD5Util.toMd5(users.getPwd()));
        users1.setU_sex(users.getU_sex());
        users1.setU_email(users.getU_email());
        users1.setU_tel(users.getU_tel());
        users1.setU_name(users.getU_name());

        System.out.println(users1.getU_sex());
        int i = usersService.register(users1);
        ResponseEntity<Integer> response=new ResponseEntity<>();

        if (i == 1) {
            response.setCode(1);
            response.setMessage("ok");
            response.setData(200);
            return response;

        }
        if (i == 0) {
            response.setCode(0);
            response.setMessage("注册失败");
            response.setData(500);
            return response;

        }
        response.setCode(-1);
        response.setMessage("注册生成");
        response.setData(500);
        return response;

    }



    /**
     * 用户登录
     * @param username
     * @param passwd
     * @param req
     * @param resp
     * @return
     * @throws Exception
     */
    @RequestMapping("/user/login")
    public ResponseEntity<Integer> login(String username, String passwd, HttpServletRequest req, HttpServletResponse resp) throws Exception {

        System.out.println("用户名:"+username);
        System.out.println("密码:"+passwd);

        ServletContext context = req.getServletContext();
        String tokenString= (String) req.getAttribute("token");
        Token token = (Token)context.getAttribute(tokenString);
        String passwd5 = MD5Util.toMd5(passwd);
        ResponseEntity<Integer> response=new ResponseEntity<>();
        Users login = usersService.login(username);

        System.out.println(login);
        System.out.println(passwd5);

        String pwd;
        try {
            pwd = login.getPwd();
            if (!pwd.equals(passwd5)){
                response.setCode(-1);
                response.setMessage("密码错误");
                response.setData(500);
                return response;
            }
        }catch (Exception e){

        }

        if (login==null){
            response.setCode(0);
            response.setMessage("用户名为空");
            response.setData(500);
            return response;
        }
        token.setUsername(username);
        response.setCode(1);
        response.setMessage("ok");
        response.setData(200);

        response.setCode(1);
        response.setMessage("ok");
        response.setData(200);
        return response;
    }



    /**
     * 获取用户名
     * @param req
     * @param resp
     * @throws IOException
     * @return
     */
    @RequestMapping("/user/getUsername")
    public Map<String, Object> GetUsername(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        String tokenString =  req.getHeader("token");
        Token token = (Token) req.getServletContext().getAttribute(tokenString);
        String username = token.getUsername();
        Map<String,Object> map=new HashMap<>();
        map.put("code",200);
        map.put("username",username);
        return map;

    }



    /**
     * 退出登录
     * @param req
     * @param resp
     * @throws IOException
     */
    @RequestMapping("/user/loginout")
    public    Map<String, Object>   loginout(HttpServletRequest req,HttpServletResponse  resp) throws IOException {

        String tokenString = req.getHeader("token");
        Token token = (Token) req.getServletContext().getAttribute(tokenString);
        req.getServletContext().removeAttribute(tokenString);
        String username = token.getUsername();

        Map<String,Object> map=new HashMap<>();
        map.put("code",200);
        map.put("username",username);
        return map;


    }




    /**
     * 查询个人信息
     */
    @RequestMapping("/user/find")
    public ModelAndView  findOne(Users users){

        ModelAndView mv=new ModelAndView();
        Users users1=usersService.findOne(users.getU_id());

        mv.setViewName("/users/update");
        mv.addObject("users",users1);
        return mv;
    }




    /**
     * 通过u_id修改
     * 修改手机，邮箱，密码
     */
    @RequestMapping("/user/update")
    public String update(Users users){
        int updateUsers = usersService.updateUsers(users);
        return   "redirect:/users/find";
    }


}
