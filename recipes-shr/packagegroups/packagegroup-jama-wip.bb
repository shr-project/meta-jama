DESCRIPTION = "JaMa images extra install"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit packagegroup allarch

PR = "r1"

RPROVIDES_${PN} += "task-jama-wip"
RREPLACES_${PN} += "task-jama-wip"
RCONFLICTS_${PN} += "task-jama-wip"

PACKAGES = "\
  ${PN} \
"

RDEPENDS_${PN} = "\
jefliks \
evopedia \
gwaterpas \
joe \
aceofpenguins \
openmoocow \
mokomaze \
mokoeightball \
"
#xlogical
#brickshooter
