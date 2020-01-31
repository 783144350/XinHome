package fung.codegenerator;

public interface Config {

    String[] TABLE_NAMES = {"roles"};

    /**
     * 输出目录
     */
    String OUTPUT_DIR = System.getProperty("user.dir") + "/src/main/java";

    /**
     * 作者
     */
    String AUTHOR = "fung";

    /**
     * 数据源URL
     */
    String DATA_SOURCE_URL = "jdbc:mysql://localhost:3306/admin?useUnicode=true&useSSL=false&characterEncoding=utf8";

    /**
     * 数据源驱动
     */
    String DATA_SOURCE_DRIVER_NAME = "com.mysql.jdbc.Driver";

    /**
     * 数据源用户名
     */
    String DATA_SOURCE_USERNAME = "root";

    /**
     * 数据源密码
     */
    String DATA_SOURCE_PASSWORD = "123456";

    /**
     * 包名
     */
    String PACKAGE_NAME = "fung.admin";

    /**
     * 模块名
     */
    String MODULE_NAME = "";

}
