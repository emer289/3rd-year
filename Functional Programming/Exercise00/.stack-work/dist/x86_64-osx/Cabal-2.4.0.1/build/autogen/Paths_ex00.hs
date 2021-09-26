{-# LANGUAGE CPP #-}
{-# LANGUAGE NoRebindableSyntax #-}
{-# OPTIONS_GHC -fno-warn-missing-import-lists #-}
module Paths_ex00 (
    version,
    getBinDir, getLibDir, getDynLibDir, getDataDir, getLibexecDir,
    getDataFileName, getSysconfDir
  ) where

import qualified Control.Exception as Exception
import Data.Version (Version(..))
import System.Environment (getEnv)
import Prelude

#if defined(VERSION_base)

#if MIN_VERSION_base(4,0,0)
catchIO :: IO a -> (Exception.IOException -> IO a) -> IO a
#else
catchIO :: IO a -> (Exception.Exception -> IO a) -> IO a
#endif

#else
catchIO :: IO a -> (Exception.IOException -> IO a) -> IO a
#endif
catchIO = Exception.catch

version :: Version
version = Version [0,1,0,0] []
bindir, libdir, dynlibdir, datadir, libexecdir, sysconfdir :: FilePath

bindir     = "/Users/emermurphy/3rd year/Functional Programming/Exercise00/.stack-work/install/x86_64-osx/85846c0382072781a82f4e7a4de7aa060549e606b225920758e4af6dc8f013a8/8.6.4/bin"
libdir     = "/Users/emermurphy/3rd year/Functional Programming/Exercise00/.stack-work/install/x86_64-osx/85846c0382072781a82f4e7a4de7aa060549e606b225920758e4af6dc8f013a8/8.6.4/lib/x86_64-osx-ghc-8.6.4/ex00-0.1.0.0-op1GcdQjhj6WNjxZIG9Bv"
dynlibdir  = "/Users/emermurphy/3rd year/Functional Programming/Exercise00/.stack-work/install/x86_64-osx/85846c0382072781a82f4e7a4de7aa060549e606b225920758e4af6dc8f013a8/8.6.4/lib/x86_64-osx-ghc-8.6.4"
datadir    = "/Users/emermurphy/3rd year/Functional Programming/Exercise00/.stack-work/install/x86_64-osx/85846c0382072781a82f4e7a4de7aa060549e606b225920758e4af6dc8f013a8/8.6.4/share/x86_64-osx-ghc-8.6.4/ex00-0.1.0.0"
libexecdir = "/Users/emermurphy/3rd year/Functional Programming/Exercise00/.stack-work/install/x86_64-osx/85846c0382072781a82f4e7a4de7aa060549e606b225920758e4af6dc8f013a8/8.6.4/libexec/x86_64-osx-ghc-8.6.4/ex00-0.1.0.0"
sysconfdir = "/Users/emermurphy/3rd year/Functional Programming/Exercise00/.stack-work/install/x86_64-osx/85846c0382072781a82f4e7a4de7aa060549e606b225920758e4af6dc8f013a8/8.6.4/etc"

getBinDir, getLibDir, getDynLibDir, getDataDir, getLibexecDir, getSysconfDir :: IO FilePath
getBinDir = catchIO (getEnv "ex00_bindir") (\_ -> return bindir)
getLibDir = catchIO (getEnv "ex00_libdir") (\_ -> return libdir)
getDynLibDir = catchIO (getEnv "ex00_dynlibdir") (\_ -> return dynlibdir)
getDataDir = catchIO (getEnv "ex00_datadir") (\_ -> return datadir)
getLibexecDir = catchIO (getEnv "ex00_libexecdir") (\_ -> return libexecdir)
getSysconfDir = catchIO (getEnv "ex00_sysconfdir") (\_ -> return sysconfdir)

getDataFileName :: FilePath -> IO FilePath
getDataFileName name = do
  dir <- getDataDir
  return (dir ++ "/" ++ name)
