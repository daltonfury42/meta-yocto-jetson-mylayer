SUMMARY = "Opencv : The Open Computer Vision Library, compiled with cuda support"
HOMEPAGE = "http://opencv.org/"
SECTION = "libs"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0ea90d28b4de883d7af5e6711f14f7bf"

ARM_INSTRUCTION_SET_armv4 = "arm"
ARM_INSTRUCTION_SET_armv5 = "arm"

DEFAULT_PREFERENCE = "-1"

DEPENDS = "python-numpy libtool swig swig-native python bzip2 zlib glib-2.0"

SRCREV_opencv = "424c2bddb39dae97dc4639a24eaa0e0c8fbb8e69"
SRCREV_contrib = "844c30e8b2f2f4b34b96a169fafe9beea3c45e87"
SRCREV_FORMAT = "opencv"
SRC_URI = "git://github.com/Itseez/opencv.git;name=opencv \
	   git://github.com/Itseez/opencv_contrib.git;destsuffix=contrib;name=contrib"

PV = "3.0+git${SRCPV}"

S = "${WORKDIR}/git"

inherit pkgconfig cmake


EXTRA_OECMAKE = "../git/ -DWITH_CUDA=ON"