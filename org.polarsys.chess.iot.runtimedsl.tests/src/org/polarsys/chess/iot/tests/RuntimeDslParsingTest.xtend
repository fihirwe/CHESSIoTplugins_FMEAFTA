/*
 * generated by Xtext 2.12.0
 */
package org.polarsys.chess.iot.tests

import com.google.inject.Inject
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
//import org.polarsys.chess.iot.runtimeDsl.Model

@RunWith(XtextRunner)
@InjectWith(RuntimeDslInjectorProvider)
class RuntimeDslParsingTest {
	@Inject
//	ParseHelper<Model> parseHelper
	
//	@Test
//	def void loadModel() {
//		val result = parseHelper.parse('''
//			Hello Xtext!
//		''')
//		Assert.assertNotNull(result)
//		Assert.assertTrue(result.eResource.errors.isEmpty)
//	}
//	
	def eResource(Model model) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}