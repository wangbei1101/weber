package org.weber.cache;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for AccountService.
 */
public class AccountServiceTest {

    private ApplicationContext context;

    private AccountService accountService;

    @Before
    public void before() {
        context = new ClassPathXmlApplicationContext(
                "spring-cache.xml");// 加载 spring 配置文件

        accountService = (AccountService) context.getBean("accountService");
        System.out.println("test before done");
    }

    @Test
    public void testGetAccountByName() {
        // 第一次查询，应该走数据库
        System.out.println("first query...");
        accountService.getAccountByName("somebody");
        // 第二次查询，应该不查数据库，直接返回缓存的值
        System.out.println("second query...");
        accountService.getAccountByName("somebody");
        System.out.println();

        Assert.assertTrue(true);
    }

    @After
    public void after() {
        System.out.println("test after done");
    }
}
