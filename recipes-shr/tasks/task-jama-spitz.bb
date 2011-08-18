DESCRIPTION = "JaMa images extra install"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit task

PACKAGES = "\
  ${PN} \
"

RDEPENDS_${PN} = "\
task-jama \
task-x11-illume \
"
