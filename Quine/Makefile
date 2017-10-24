JAVAC=javac

# generate .java file list
sources = $(wildcard *.java)

# generate .class file list
classes = $(sources:.java=.class)

all: build

build: $(classes)

clean :
	rm -f *.class

%.class : %.java
	$(JAVAC) $<

jar: $(classes)
	jar cvf myjarfile.jar $(classes) 

# Avoid Makefile depend on real file and generate errors
.PHONY : clean, all, build, jar
