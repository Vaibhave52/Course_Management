package com.app.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "recordings")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class RecordedVideo  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "recorded_video_id")
	private Long recordedVideoId;

	@Column(name = "video_title",nullable = false,length = 30)
	private String videoTitle;
	
	@Column(name = "date",nullable = false)
	private LocalDateTime Date;
	
	@Column(name = "video_url",nullable = false,length = 100)
	private String videoUrl;
	
	@ManyToOne
	@JoinColumn(name = "course_id")
	private Course course;

}
