
package com.kind.core.configration;

import javax.annotation.Resource;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PropertyReloader {

	@Resource(name = "propertyConfigurer")
	private CustomizedPropertyConfigurer customizedPropertyConfigurer;

	@Scheduled(initialDelay = 10 * 60 * 1000, fixedDelay = 5 * 60 * 1000)
	public void reload() {
		customizedPropertyConfigurer.reload();
	}

}
