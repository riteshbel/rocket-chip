// See LICENSE.SiFive for license details.

package groundtest

object Generator extends util.GeneratorApp {
  val longName = names.topModuleProject + "." + names.configs
  generateFirrtl
  generateTestSuiteMakefrags // TODO: Needed only for legacy make targets
  generateArtefacts
}
