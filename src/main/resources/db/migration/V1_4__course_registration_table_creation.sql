CREATE TABLE school.course_registration (
	student_id int REFERENCES school.student(id) ON UPDATE CASCADE ON DELETE CASCADE,
	course_id int REFERENCES school.course(id) ON UPDATE cascade,
	CONSTRAINT course_registration_pkey PRIMARY KEY (student_id, course_id)
);