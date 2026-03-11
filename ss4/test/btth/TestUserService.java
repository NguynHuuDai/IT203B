package btth;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class TestUserService {

    UserService userService;

    // sử dụng beforeEach để mỗi lần dữ liệu sẽ khác nhau
    @BeforeEach
    public void initData() {
        userService = new UserService();
        userService.addUser(new User(1,"Lê Thanh Tùng","tung@gmail.com"));
    }

    // test case 1: thêm mới
    @Test
    @DisplayName("kiểm tra thêm mới")
    public void testFeatureAdd() {
        userService.addUser(new User(
                2,
                "Trần Thị Khánh Huyền",
                "huyen@gmail.com")
        );
        Assert.assertEquals(2,userService.users.size());
    }

    // test case 2: kiểm tra thêm có ngoại lệ không
    @Test
    @DisplayName("kiểm tra có ngoại lệ hay không")
    public void testThrowsException() {
        Assert.assertThrows(IllegalArgumentException.class,() -> {
            userService.addUser(
                    new User(
                            1,
                            "      ",
                            "null@gmail.com"
                    )
            );
        });
    }

    // test case 3: tìm kiếm người không tại có null hay không
    @Test
    @DisplayName("Kiểm tra có null hay không")
    public void testFindUserById() {
        User userFind = userService.findUserById(2);
        Assert.assertNull(userFind);
    }

    // test case 4: kiểm tra định dạng email hợp lệ hay không
    @Test
    @DisplayName("kiểm tra định dạng email")
    public void testRegexEmail() {
        boolean result = userService.isValidEmail("dai@gmail.com");
        Assert.assertTrue(result);
    }

}