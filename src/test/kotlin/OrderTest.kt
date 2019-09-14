import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class OrderTest {

    @Test
    fun insertOrder() {

        val order = Order()
        val mockEmailUtil = MockEmailUtil()

        val userEmail = "someMail@gmail.com"
        order.insertOrder(userEmail, 1, 200, mockEmailUtil)

        //用mockEmailUtil.receiveEmail來驗證order.insert裡是否有呼叫IEmailUtil.setCustomer
        Assert.assertEquals(userEmail, mockEmailUtil.receiveEmail)

    }
}