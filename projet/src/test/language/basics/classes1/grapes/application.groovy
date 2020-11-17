package test.language.basics.classes1.grapes

@Grab(group = 'org.apache.commons', module='commons-lang3', version = '3.11')
import org.apache.commons.lang3.StringUtils


List<String> languages=[]
languages << "Java"
languages << "Groovy"
languages << "Angular"

println StringUtils.join(languages,",")
