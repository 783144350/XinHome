package fung.codegenerator;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class CodeGenerator {
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        setGlobalConfig(mpg);

        // 数据源配置
        setDataSourceConfig(mpg);

        // 包配置
        setPackageConfig(mpg);

        // 配置模板
        setTemplateConfig(mpg);

        // 策略配置
        setStrategyConfig(mpg);

        // 设置模板引擎
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());

        mpg.execute();
    }

    private static void setStrategyConfig(AutoGenerator mpg) {
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        strategy.setSuperEntityClass("你自己的父类实体,没有就不用设置!");
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);

        // 公共父类
//        strategy.setSuperControllerClass("你自己的父类控制器,没有就不用设置!");
        // 写于父类中的公共字段
//        strategy.setSuperEntityColumns("id");
        strategy.setInclude(Config.TABLE_NAMES);
        strategy.setControllerMappingHyphenStyle(true);
        mpg.setStrategy(strategy);
    }

    private static void setTemplateConfig(AutoGenerator mpg) {
        TemplateConfig templateConfig = new TemplateConfig();
        templateConfig.setXml(null);
//        templateConfig.setController(null);
//        templateConfig.setService(null);
        mpg.setTemplate(templateConfig);
    }

    private static void setPackageConfig(AutoGenerator mpg) {
        PackageConfig pc = new PackageConfig();
        pc.setModuleName(Config.MODULE_NAME);
        pc.setParent(Config.PACKAGE_NAME);
        mpg.setPackageInfo(pc);
    }

    private static void setDataSourceConfig(AutoGenerator mpg) {
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl(Config.DATA_SOURCE_URL);
        dsc.setDriverName(Config.DATA_SOURCE_DRIVER_NAME);
        dsc.setUsername(Config.DATA_SOURCE_USERNAME);
        dsc.setPassword(Config.DATA_SOURCE_PASSWORD);
        mpg.setDataSource(dsc);
    }

    private static void setGlobalConfig(AutoGenerator mpg) {
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor(Config.AUTHOR);
        gc.setOpen(false);
        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);
    }
}
