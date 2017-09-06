ANT = ant
BUILD = build.xml


all: clean build test

build:
	$(ANT) -buildfile $(BUILD)

test:
	$(ANT) -buildfile $(BUILD) test

clean:
	$(ANT) -buildfile $(BUILD) clean




