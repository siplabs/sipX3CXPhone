include $(top_srcdir)/config/utility.am
include $(top_srcdir)/config/java.am
include $(srcdir)/common.am

EXTRA_DIST = \
	$(3cxphone_SRC) \
	$(3cxphone_RESOURCES)

noinst_DATA = javac-yealink

jardir = @SIPX_JAVADIR@/sipXconfig/plugins
JAR_FILE = sipXyealink.jar
jar_DATA = $(JAR_FILE)

3cxphone_SRC = $(shell cd $(srcdir); find org -name '*.java' -type f )
3cxphone_RESOURCES = sipxplugin.beans.xml

3cxphone_DEPS = \
	$(call JavaDep,@SIPX_JAVADIR@/sipXconfig @SIPX_JAVADIR@/sipXcommons,$(3cxphone_PKGS))

$(JAR_FILE) : javac-yealink $(3cxphone_RESOURCES)
	jar cf $@ \
	  $(call JarInclude,$(JAVAROOT),.) \
	  $(call JarInclude,$(srcdir),$(3cxphone_RESOURCES))

style_SRC = $(3cxphone_SRC)
precommit : style validate-xml

validate-xml : sipxplugin.beans.xml
	xmllint --noout \
	  --schema $(SIPX_DATADIR)/schema/spring-beans-2.0.xsd  \
	$^

