package chb;

import redis.clients.jedis.Jedis;

public class JedisMeo {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.216.128",6379);
        jedis.auth("cc15907007189");
        String str = jedis.ping();
        System.out.println(str);
        System.out.println("push test");
    }
}
