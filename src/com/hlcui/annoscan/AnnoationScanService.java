package com.hlcui.annoscan;

import java.util.Set;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import com.hlcui.annotation.DataProvider;

public class AnnoationScanService {
	public static void main(String[] args) {
		//true Component ManagedBean Named  //需要jre1.8版本一下
		ClassPathScanningCandidateComponentProvider provider = new ClassPathScanningCandidateComponentProvider(true);
		provider.addIncludeFilter(new AnnotationTypeFilter(DataProvider.class));
		Set<BeanDefinition> sets = provider.findCandidateComponents("com.hlcui");
		for (BeanDefinition bf : sets) {
			System.out.println(bf.getBeanClassName());
		}
	}
}
