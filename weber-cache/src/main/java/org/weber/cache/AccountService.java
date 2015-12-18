package org.weber.cache;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * User: wangbei
 * Date: 2015/12/18
 * Time: 15:57
 * Desc:
 */
@Service
public class AccountService {

    private static Log log = LogFactory.getLog(AccountService.class);

    @Cacheable(value = "accountCache")// 使用了一个缓存名叫 accountCache
    public Account getAccountByName(String acctName) {
        // 方法内部实现不考虑缓存逻辑，直接实现业务
        System.out.println("real query account."+acctName);
        return getFromDB(acctName);
    }

    @CachePut(value = "accountCache", key = "#account.getName()")
    public void update(Account account) {
        System.out.println("update account." + account.getName());
    }

    private Account getFromDB(String acctName) {
        System.out.println("real querying db..." + acctName);
        return new Account(acctName);
    }
}