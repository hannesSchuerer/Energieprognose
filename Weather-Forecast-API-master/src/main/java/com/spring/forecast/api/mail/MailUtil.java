package com.spring.forecast.api.mail;

import java.nio.charset.StandardCharsets;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamSource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.spring.forecast.api.dto.DisplayLocation;
import com.spring.forecast.api.dto.WeatherInfo;
@Component
public class MailUtil {
	@Autowired
	private JavaMailSender sender;
	@Autowired
	private TemplateEngine templateEngine;

	public String sendEmail(String to, String subject, MultipartFile image, InputStreamSource imageSource,
			DisplayLocation userLocation, WeatherInfo weather) throws Exception {
		String templateName = "email/emailTemplate";
		Context context = new Context();
		context.setVariable("weather", weather);
		context.setVariable("location", userLocation);
		// add for image
		context.setVariable("imageResourceName", image.getName());
		String body = templateEngine.process(templateName, context);

		MimeMessage mail = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(mail, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
				StandardCharsets.UTF_8.name());
		helper.setTo(to);
		helper.setSubject(subject);
		helper.setText(body, true);
		helper.addInline(image.getName(), imageSource, image.getContentType());
		helper.setFrom("basant1993.dev@gmail.com");
		sender.send(mail);
		return "mail send successfully";
	}

}
