package com.lbachannel.mathutil.core;

import static com.lbachannel.mathutil.core.MathUtil.getFactory;
// import static dành riêng cho những hàm static - gọi hàm mà bỏ qua tên class
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MathUtilTest {
    
    /* 
     *    @Test
     *    public void testGetFactorialGivenRightArgReturnsWell(){
     *          assertEquals(120, getFactory(5));
     *    }
     *  
     *    Bắt ngoại lệ khi đưa data cà chớn!!!   |    @Test (expected = ten ngoại lệ.class) Chỉ dùng cho JUnit 4
     *    Biểu thức Lambda
     *    hàm nhận tham số thứ 2 là 1 object / có code implement cái functional interface tên là Executable - có 1 hàm duy nhất ko code
     *    tên là execute()
     *    @Test
     *    public void testGetFactorialGivenWrongArgThrowException(){
     *          // cách 1: chậm
     *          Executable excObject = new Executable() {
     *                 @Override
     *                 public void execute() throws Throwable {
     *                       getFactory(-5);
     *                 }
     *          };
     *          assertThrows(IllegalArgumentException.class, excObject);
     *          
     *          // cách 2: vừa
     *          Executable excObject = () -> getFactory(-5);
     *          assertThrows(IllegalArgumentException.class, excObject);
     *
     *          //cách 3: nhanh
     *          assertThrows(IllegalArgumentException.class, () -> getFactory(-5));
     *
     *
     *    }
     */
    
    /* 
     *    Chơi DDT - Data Driven Testing
     *    tách data ra khỏi câu lệnh kiểm thử, tham số hóa data này
     *    vào trong câu lệnh kiểm thử
     *    chuẩn bị bộ data
     */
    public static Object[][] initData(){
        return new Integer[][]{
            {1, 1},
            {2, 2},
            {3, 6},
            {5, 120}
        };
    }
    @ParameterizedTest
    @MethodSource(value = "initData") // tên hàm cung cấp data, ngầm định thứ tự của mảng
    public void testGetFactorialGivenRightArgReturnsWell(int input, long expected){
        assertEquals(expected, getFactory(input));
    }
}
