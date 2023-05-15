package feedback.management.system.feedback.system;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Build;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataSourceConfig {
	
	@Bean
	public DataSource getDataSource() {
		DataSource dataSource = null;
		
		DataSourceBuilder builder = DataSourceBuilder.create(); 
		builder.url("jdbc:mysql://localhost:3306/restaurant");
		builder.username("root");
		builder.password("02March2001");
		builder.driverClassName("com.mysql.jdbc.Driver");
		
		dataSource = builder.build();
		
		return dataSource;
	}

}
