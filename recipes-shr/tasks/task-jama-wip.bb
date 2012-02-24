DESCRIPTION = "JaMa images extra install"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit task allarch


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
