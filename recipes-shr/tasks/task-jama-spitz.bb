DESCRIPTION = "JaMa images extra install"

inherit task

PACKAGES = "\
  ${PN} \
"

RDEPENDS_${PN} = "\
task-jama \
task-x11-illume \
"
