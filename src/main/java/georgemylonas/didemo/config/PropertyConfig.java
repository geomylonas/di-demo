package georgemylonas.didemo.config;

import georgemylonas.didemo.examplebeans.FakeDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

    @Autowired
    org.springframework.core.env.Environment env;


    @Value("${georgemylonas.username}")
    String username;

    @Value("${georgemylonas.password}")
    String password;

    @Value("${georgemylonas.dburl}")
    String url;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource=new FakeDataSource();
        fakeDataSource.setUsername(env.getProperty("USERNAME"));
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }


    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer=new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }






}
